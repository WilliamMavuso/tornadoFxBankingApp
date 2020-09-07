object AccountNumbers {

    var accountRecords = mutableListOf<Int>()
    fun addRecord(record:Int){
        for (i in accountRecords){
            accountRecords.add(record)
        }
    }
}