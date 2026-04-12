package com.example.utsunittest


import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import com.google.common.truth.Truth.assertThat

/*
 * Class: RegistrationInstrumentedTest
 *
 * Deskripsi:
 * Kelas ini digunakan untuk melakukan pengujian pada lingkungan Android
 * secara langsung (instrumental testing).
 *
 * Tujuan:
 * Memastikan bahwa aplikasi dapat berjalan dengan benar pada device/emulator,
 * terutama dalam hal akses context dan konfigurasi package.
 */
@RunWith(AndroidJUnit4::class)
class RegistrationInstrumentedTest {

    /*
     * Test Case 1:
     * Nama: contextNotNull
     *
     * Tujuan:
     * Memastikan bahwa context aplikasi berhasil diinisialisasi.
     *
     * Kondisi:
     * - Mengambil context menggunakan InstrumentationRegistry
     *
     * Ekspektasi:
     * - Context tidak boleh null
     *   karena aplikasi harus memiliki environment Android yang valid.
     */
    @Test
    fun contextNotNull() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertThat(appContext).isNotNull()
    }

    /*
     * Test Case 2:
     *
     * Tujuan:
     * Memastikan bahwa package name aplikasi sesuai dengan konfigurasi project.
     *
     * Kondisi:
     * - Mengambil package name dari context
     *
     * Ekspektasi:
     * - Package name mengandung "utsunittest"
     *   sesuai dengan nama project yang dibuat.
     */
    @Test
    fun packageNameCorrect() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertThat(appContext.packageName).contains("utsunittest")
    }
}