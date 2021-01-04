//data class DTO(val no:Int){
//    Operator fun plus(arg : Int):Int{
//        return no + arg
//    }
//
//    //동일한 다른 타입의 객체와 덧셈을 하는 연산자 오버로딩
//    operator fun plus(arg : DTO):Int{
//        return no + arg.no
//    }
//}
//
//fun main(args:Array<String>){
//    val data1 = DTO(no:10)
//    val data2 = DTO(no:20)
//
//    //연산자 오버로딩을 하지 않은 경우는 내부 데이터끼리 연산을 수행해야 합니다.
//
//    var result = data1.no + data2.no
//    println("result:${result}")
//
//    result = data1 + 50
//    println("result:${result}")
//
//    //인스턴스와 인스턴스 덧셈
//    result = data1 + data2
//    println("result:${result}")
//}