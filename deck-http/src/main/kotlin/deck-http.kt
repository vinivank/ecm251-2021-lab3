import org.json.JSONArray

fun main() {
    val resposta = khttp.get("https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1")
    val baralho_id=resposta.jsonObject["deck_id"]
    val resposta_carta=khttp.get("https://deckofcardsapi.com/api/deck/$baralho_id/draw/?count=1")
    val carta_json : JSONArray=resposta_carta.jsonObject["cards"] as JSONArray
    val valorDaCarta = carta_json[0]
    println(" ")





}