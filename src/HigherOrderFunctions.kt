fun main(){
    dislayMessage(::morning)
    dislayMessage(::evening)
}
fun dislayMessage(mes: () -> Unit){ mes()}
fun morning(){println("Good Morning")}
fun evening(){println("Good Evening")}
