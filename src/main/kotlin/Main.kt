fun main(args: Array<String>) {
    var sun: Array<Double> = arrayOf(1.0, 2.0, 3.0, 4.0, -5.0, -6.0, 2.0, 1.0, -4.0, 0.5, -3.0, 4.0, -7.0, 9.0, -9.0,)
    var bool: Boolean = false
    var dob: Double = 0.0
    var bit: Int = 0
    for (i in sun){
        if (i<0){
            bool = true
        }
        if(bool==true &&i>0){
            dob += i
            bit += 1
        }
    }
    println(dob/bit)
}
