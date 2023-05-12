package com.example.quizzzz

object const {

    fun getquestions(): ArrayList<question>{
        val quelist = ArrayList<question>()

        val que1 = question(
            1,
            "WHAT COUNTRY",
            R.drawable.argtn,
            "Argentin",
            "armenia",
            "TURKEY",
            "moon",
            1

        )

        quelist.add(que1)

        val que2 = question(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Angola", "Austria",
            "Australia", "Armenia", 3
        )

        quelist.add(que2)

        // 3
        val que3 = question(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Belarus", "Belize",
            "Brunei", "Brazil", 4
        )

        quelist.add(que3)

        // 4
        val que4 = question(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Bahamas", "Belgium",
            "Barbados", "Belize", 2
        )

        quelist.add(que4)

        // 5
        val que5 = question(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Gabon", "France",
            "Fiji", "Finland", 3
        )

        quelist.add(que5)

        // 6
        val que6 = question(
            6, "What country does this flag belong to?",
            R.drawable.germany,
            "Germany", "Georgia",
            "Greece", "none of these", 1
        )

        quelist.add(que6)

        // 7
        val que7 = question(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Dominica", "Egypt",
            "Denmark", "Ethiopia", 3
        )

        quelist.add(que7)

        // 8
        val que8 = question(
            8, "What country does this flag belong to?",
            R.drawable.india,
            "Ireland", "Iran",
            "Hungary", "India", 4
        )

        quelist.add(que8)





        return quelist



    }
}