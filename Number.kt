//Tipe Data number
//Integer Number atau bilangan bulat
//Floating Point Number atau bilangan pecahan


fun main() {
//Contoh Integer Number
    var age: Byte = 10
    var height: Int = 170
    var distance: Short = 2000
    var balance: Long= 10000000L

    println("Umur anda adalah: $age")
    println(height)
    println(distance)
    println(balance)

//Contoh Floating Point Number
    var sample: Float = 10.12F
    var radius: Double = 2345678923.54535

    println(sample)
    println(radius)

//literal
    var decimalLiteral: Int = 100
    var hexadecimalLiteral: Int = 0xFF
    var binaryLiteral: Int = 0b0001

    println(decimalLiteral)
    println(hexadecimalLiteral)
    println(binaryLiteral)

// Underscore di angka berguna untuk supaya mudah dibaca
    var age1: Byte = 3_0
    var height1: Int = 1_7_0
    var distance1: Short = 2_000
    var balance1: Long = 100_000_000L

    println(age1)
    println(height1)
    println(distance1)
    println(balance1)

// Nilai Konversi
    var number: Int= 100

    var byte2: Byte = number.toByte()
    var short2: Short = number.toShort()
    var int2: Int = number.toInt()
    var long2: Long = number.toLong()
    var float2: Float = number.toFloat()
    var double2: Double = number.toDouble()

    println(byte2)
    println(short2)
    println(int2)
    println(long2)
    println(float2)
    println(double2)
}
