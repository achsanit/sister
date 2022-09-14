fun main() {
    val firstThread = MyThread("firstThread")
    val secondThread = MyThread("secondThread")

    firstThread.start()
    secondThread.start()
}

class MyThread(var threadName: String): Thread(){
    override fun run(){
        var count = 0
        while (count<5){
            println("$threadName : $count")
            count++
            try{
                Thread.sleep(1000)
            }catch (ex:Exception){
                print(ex.message)
            }
        }
    }
}