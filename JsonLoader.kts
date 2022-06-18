import org.json.JSONArray
import java.io.File


class JsonLoader(){
    /**
     * @param jsonFileName - name of json array file
     * */
    fun loadData(jsonFileName: String): ArrayList<String> {
        val inputStream = File(jsonFileName)
        val jsonArray = JSONArray(inputStream.bufferedReader().use { it.readText() })

        val size = jsonArray.length()
        val result = ArrayList<String>(size)

        for (i in 0 until size){
            result.add(jsonArray.getJSONObject(i).getString("city"))
        }

        return result
    }
}
