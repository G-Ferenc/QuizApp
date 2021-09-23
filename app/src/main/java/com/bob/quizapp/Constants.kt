package com.bob.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

//List of questions
    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(0, "What is 4x4 ?",
            R.drawable.mathspng,
            optionOne = "16",
            optionTwo = "44",
            optionThree = "8",
            optionFour = "34",
            correctAnswer = 1
        )
        questionsList.add(que1)

        val que2 = Question(1, "What is 6x6 ?",
            R.drawable.mathspng,
            optionOne = "66",
            optionTwo = "16",
            optionThree = "36",
            optionFour = "79",
            correctAnswer = 3
        )
        questionsList.add(que2)

        val que3 = Question(2, "What is 10x10 ?",
            R.drawable.mathspng,
            optionOne = "1000",
            optionTwo = "100",
            optionThree = "2000",
            optionFour = "150",
            correctAnswer = 2
        )
        questionsList.add(que3)

        val que4 = Question(3, "What is 9x6 ?",
            R.drawable.mathspng,
            optionOne = "56",
            optionTwo = "69",
            optionThree = "96",
            optionFour = "54",
            correctAnswer = 4
        )
        questionsList.add(que4)

        val que5 = Question(4, "What is 20x5 ?",
            R.drawable.mathspng,
            optionOne = "100",
            optionTwo = "50",
            optionThree = "25",
            optionFour = "55",
            correctAnswer = 1
        )
        questionsList.add(que5)

        val que6 = Question(5, "What is 100-75 ?",
            R.drawable.mathspng,
            optionOne = "0",
            optionTwo = "50",
            optionThree = "75",
            optionFour = "25",
            correctAnswer = 4
        )
        questionsList.add(que6)

        val que7 = Question(6, "What is 900+900 ?",
            R.drawable.mathspng,
            optionOne = "2000",
            optionTwo = "1500",
            optionThree = "1800",
            optionFour = "2500",
            correctAnswer = 3
        )
        questionsList.add(que7)

        val que8 = Question(7, "What is 12x50 ?",
            R.drawable.mathspng,
            optionOne = "1250",
            optionTwo = "600",
            optionThree = "1000",
            optionFour = "650",
            correctAnswer = 2
        )
        questionsList.add(que8)

        val que9 = Question(8, "What is 50x100 ?",
            R.drawable.mathspng,
            optionOne = "5000",
            optionTwo = "10000",
            optionThree = "6",
            optionFour = "50000",
            correctAnswer = 1
        )
        questionsList.add(que9)

        val que10 = Question(9, "What is 2+2 ?",
            R.drawable.mathspng,
            optionOne = "2",
            optionTwo = "5",
            optionThree = "6",
            optionFour = "4",
            correctAnswer = 4
        )
        questionsList.add(que10)




        return questionsList
    }



}