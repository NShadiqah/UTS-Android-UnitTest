package com.example.utsunittest

import org.junit.Test
import com.google.common.truth.Truth.assertThat

/*
 * Class: RegistrationUtilTest
 *
 * Deskripsi:
 * Kelas ini digunakan untuk melakukan pengujian (unit testing)
 * terhadap fungsi validasi yang terdapat pada class RegistrationUtil.
 *
 * Tujuan:
 * Memastikan bahwa setiap fungsi validasi (username & password)
 * bekerja sesuai dengan aturan yang telah ditentukan.
 *
 * Aturan validasi:
 * - Username tidak boleh kosong dan minimal 3 karakter
 * - Password minimal 6 karakter dan harus mengandung angka
 */
class RegistrationUtilTest {

    /*
     * Test ini memastikan username kosong tidak valid
     */
    @Test
    fun emptyUsername_returnsFalse() {
        val result = RegistrationUtil().validateUsername("")
        assertThat(result).isFalse()
    }

    /*
     * Test ini memastikan username valid jika panjang >= 3
     */
    @Test
    fun validUsername_returnsTrue() {
        val result = RegistrationUtil().validateUsername("abc")
        assertThat(result).isTrue()
    }

    /*
     * Test ini memastikan password tanpa angka tidak valid
     */
    @Test
    fun passwordWithoutDigit_returnsFalse() {
        val result = RegistrationUtil().validatePassword("abcdef")
        assertThat(result).isFalse()
    }

    /*
     * Test ini memastikan password valid jika ada angka
     */
    @Test
    fun validPassword_returnsTrue() {
        val result = RegistrationUtil().validatePassword("abc123")
        assertThat(result).isTrue()
    }
}