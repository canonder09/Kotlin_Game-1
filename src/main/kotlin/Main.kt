import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val options = arrayOf("taş", "kağıt", "makas")
    var count = 0;
    var PcCount=0;



    while (true) {
        // Kullanıcıdan seçim al
        println("Taş, Kağıt, Makas seçin:")
        val userChoice = scanner.nextLine().lowercase()

        // Bilgisayarın rastgele bir seçim yapm33333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333ası
        val computerChoice = options.random()

        // Seçimleri göster
        println("Senin seçimin: $userChoice")
        println("Bilgisayarın seçimi: $computerChoice")

        // Kazanma durumlarını kontrol et
        if (userChoice == computerChoice) {
            println("Berabere!")

        } else if ((userChoice == "taş" && computerChoice == "makas") ||
            (userChoice == "kağıt" && computerChoice == "taş") ||
            (userChoice == "makas" && computerChoice == "kağıt")) {

            println("Tebrikler, kazandın!")
            count++
            println("$count - $PcCount" )
        } else {
            println("Bilgisayar kazandı!")
            PcCount++
            println("$count - $PcCount" )

        }


        if(PcCount==3)
        {
            println("Bilgisayar komple oyunu kazandı, sikildin! ")
            println("Tekrar oynamak ister misin? (evet/hayır):")
            val playAgain = scanner.nextLine().lowercase()
            if (playAgain != "evet") {
                break
            }
            else{
                count = 0
                PcCount = 0
            }
        }


        else if( count==3)
        {
            println("Sen kazandın, bi zahmet amk ")
            println("Tekrar oynamak ister misin? (evet/hayır):")
            val playAgain = scanner.nextLine().lowercase()
            if (playAgain == "hayır") {
                break
            }
            else{
                count = 0
                PcCount = 0
            }
        }
    }
}
