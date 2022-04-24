package com.huawei.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()
        val que1 = Question(
            1,
            "Which country does this flag belong to?",
            R.drawable.argentina, "Argentina", "Australia",
            "Fiji", "Kazakhstan", 1
        )
        questionsList.add(que1)
        // XXXXXXXXXXX 2ND XXXXXXXXXXX
        val que2 = Question(
            2,
            "Which country does this flag belong to?",
            R.drawable.belgium, "Portugal", "Belgium",
            "Uzbekistan", "Germany", 2
        )
        questionsList.add(que2)

        // XXXXXXXXXXX 3RD XXXXXXXXXXX
        val que3 = Question(
            3,
            "Which country does this flag belong to?",
            R.drawable.denmark, "Denmark", "Russia",
            "Uruguay", "Germany", 1
        )
        questionsList.add(que3)

        // XXXXXXXXXXX 4TH XXXXXXXXXXX

        val que4 = Question(
            4,
            "Which country does this flag belong to?",
            R.drawable.brazil, "Fiji", "Brazil",
            "Hawaii", "South Africa", 2
        )
        questionsList.add(que4)
        // XXXXXXXXXXX 5TH XXXXXXXXXXX

        val que5 = Question(
            5,
            "Which country does this flag belong to?",
            R.drawable.india, "New Zealand", "Canada",
            "India", "USA", 3
        )
        questionsList.add(que5)
        // XXXXXXXXXXX 6TH XXXXXXXXXXX

        val que6 = Question(
            6,
            "Which country does this flag belong to?",
            R.drawable.kuwait, "Mexico", "Puerto Rico",
            "Saudi Arabia", "Kuwait", 4
        )
        questionsList.add(que6)
        // XXXXXXXXXXX 7TH XXXXXXXXXXX

        val que7 = Question(
            7,
            "Which country does this flag belong to?",
            R.drawable.fiji, "Fiji", "Canada",
            "Honolulu", "Nigeria", 1
        )
        questionsList.add(que7)
        // XXXXXXXXXXX 8TH XXXXXXXXXXX

        val que8 = Question(
            8,
            "Which country does this flag belong to?",
            R.drawable.australia, "USA", "Australia",
            "Austria", "New Zealand", 2
        )
        questionsList.add(que8)
        // XXXXXXXXXXX 9TH XXXXXXXXXXX
        val que9 = Question(
            9,
            "Which country does this flag belong to?",
            R.drawable.germany, "Belgium", "France",
            "Germany", "Sweden", 3
        )
        questionsList.add(que9)

        return questionsList
    }
}
