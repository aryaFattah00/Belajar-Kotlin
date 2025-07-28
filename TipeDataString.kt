import java.security.Principal

// Tipe data string adalah tipe data yang berisikan data kumpulan karakter atau sederhananya adalah teks
// untuk membuat string di kotlin kita bisa mengunakan
// 1. " (petik 2) untuk teks satu baris
// 2. """( petik 2 sebanyak 3 kali) untuk teks yang lebih dari satu baris
// .trimMargin digunakan untuk menghapus celah supaya bisa rata kiri ketika di print

// String template adalah kemampuan string di kotlin yang mendukung ekpresi template. $ (simbol string template). ${isi ekspresi}
// dengan string template secara otomatis kita bisa mengakses data dari luar teks string
fun main() {
    var FirstName: String = "Arya"
    var LastName: String = "Fattah"
    var Fullname: String = FirstName + " " + LastName  // Tidak direkomedasikan menggunakan doubble ++
    var Fullname1: String = "$FirstName $LastName"
    var desc: String = "$Fullname length = ${Fullname.length}"


    var Info: String = """
        Info pencurian motor 
        wilayah Kabupaten trenggalek
        Jatimmmm
    """

    var Info2: String = """
Info pencurian motor 
wilayah Kabupaten trenggalek
Jatimmmm
    """
    var Info3: String = """
    |Info pencurian motor 
    |wilayah Kabupaten trenggalek
    |Jatimmmm
    """.trimMargin()
    var Info4: String = """
    >Info pencurian motor 
    >wilayah Kabupaten trenggalek
    >Jatimmmm
    >Indonesia
    """.trimMargin(">")

    println(FirstName)
    println(LastName)
    println(Info)
    println(Info2)
    println(Info3)
    println(Info4)
    println(Fullname)
    println(Fullname1)
    println(desc)
}