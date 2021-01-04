fun main(args:Array<String>){
    //1부터 10까지의 합계 구하기
    var tot : Int = 0
    var idx = 0
    while (idx < 1000){
        idx += 1
        tot += idx
    }
    println("tot:${tot}")

    //0.1을 1000번 더하기
    var sum : Double = 0.0
    idx = 0
    do{
        idx ++
        sum += 0.1
    }while (idx < 1000)
    println("sum:${sum}")

    idx = 0
    while (idx < 10){
        idx += 1
        //idx 가 3의 배수이면 종료
        //break 대신에 continue를 사용하면 3의 배수인 경우만
        //출력에서 제외됩니다.
        if(idx %3 == 0){
            //break
            continue
        }
        println("idx: ${idx}")
    }

    outer@ for (i in 1..3){
         for(j in 1..3){
            if(j > 1){
                //outer 라는 레이블을 가진 반복문 종료
                break@outer
            }
            println("i:${i} j:${j}")
        }
    }


}