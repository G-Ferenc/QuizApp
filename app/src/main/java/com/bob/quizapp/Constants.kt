package com.bob.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

//List of questions
    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(0, "What is 2+2 ?",
            R.drawable.mathspng,
            optionOne = "4",
            optionTwo = "2",
            optionThree = "8",
            optionFour = "10",
            correctAnswer = 1
        )
        questionsList.add(que1)

        val que2 = Question(1, "What is 4+4 ?",
            R.drawable.mathspng,
            optionOne = "2",
            optionTwo = "10",
            optionThree = "8",
            optionFour = "9",
            correctAnswer = 3
        )
        questionsList.add(que2)

        val que3 = Question(2, "What is 5+1 ?",
            R.drawable.mathspng,
            optionOne = "10",
            optionTwo = "6",
            optionThree = "12",
            optionFour = "8",
            correctAnswer = 2
        )
        questionsList.add(que3)

        val que4 = Question(3, "What is 7+3 ?",
            R.drawable.mathspng,
            optionOne = "15",
            optionTwo = "9",
            optionThree = "12",
            optionFour = "10",
            correctAnswer = 4
        )
        questionsList.add(que4)

        val que5 = Question(4, "What is 3+3 ?",
            R.drawable.mathspng,
            optionOne = "6",
            optionTwo = "7",
            optionThree = "9",
            optionFour = "12",
            correctAnswer = 1
        )
        questionsList.add(que5)

        val que6 = Question(5, "What is 9+1 ?",
            R.drawable.mathspng,
            optionOne = "0",
            optionTwo = "15",
            optionThree = "12",
            optionFour = "10",
            correctAnswer = 4
        )
        questionsList.add(que6)

        val que7 = Question(6, "What is 4+4 ?",
            R.drawable.mathspng,
            optionOne = "9",
            optionTwo = "7",
            optionThree = "8",
            optionFour = "6",
            correctAnswer = 3
        )
        questionsList.add(que7)

        val que8 = Question(7, "What is 2+7 ?",
            R.drawable.mathspng,
            optionOne = "8",
            optionTwo = "9",
            optionThree = "10",
            optionFour = "12",
            correctAnswer = 2
        )
        questionsList.add(que8)

        val que9 = Question(8, "What is 5+10 ?",
            R.drawable.mathspng,
            optionOne = "15",
            optionTwo = "12",
            optionThree = "17",
            optionFour = "14",
            correctAnswer = 1
        )
        questionsList.add(que9)

        val que10 = Question(9, "What is 12+12 ?",
            R.drawable.mathspng,
            optionOne = "20",
            optionTwo = "25",
            optionThree = "21",
            optionFour = "24",
            correctAnswer = 4
        )
        questionsList.add(que10)




        return questionsList
    }
    //List of questions for EASY
    fun getQuestionsEasy(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(0, "What is 10+10 ?",
            R.drawable.mathspng,
            optionOne = "25",
            optionTwo = "20",
            optionThree = "30",
            optionFour = "40",
            correctAnswer = 2
        )
        questionsList.add(que1)

        val que2 = Question(1, "What is 6+10 ?",
            R.drawable.mathspng,
            optionOne = "16",
            optionTwo = "26",
            optionThree = "10",
            optionFour = "30",
            correctAnswer = 1
        )
        questionsList.add(que2)

        val que3 = Question(2, "What is 15+5 ?",
            R.drawable.mathspng,
            optionOne = "25",
            optionTwo = "30",
            optionThree = "20",
            optionFour = "22",
            correctAnswer = 3
        )
        questionsList.add(que3)

        val que4 = Question(3, "What is 9+6 ?",
            R.drawable.mathspng,
            optionOne = "10",
            optionTwo = "13",
            optionThree = "19",
            optionFour = "15",
            correctAnswer = 4
        )
        questionsList.add(que4)

        val que5 = Question(4, "What is 7+7 ?",
            R.drawable.mathspng,
            optionOne = "14",
            optionTwo = "18",
            optionThree = "13",
            optionFour = "20",
            correctAnswer = 1
        )
        questionsList.add(que5)

        val que6 = Question(5, "What is 8-3 ?",
            R.drawable.mathspng,
            optionOne = "8",
            optionTwo = "3",
            optionThree = "11",
            optionFour = "5",
            correctAnswer = 4
        )
        questionsList.add(que6)

        val que7 = Question(6, "What is 9+9 ?",
            R.drawable.mathspng,
            optionOne = "15",
            optionTwo = "24",
            optionThree = "18",
            optionFour = "19",
            correctAnswer = 3
        )
        questionsList.add(que7)

        val que8 = Question(7, "What is 3+3+3 ?",
            R.drawable.mathspng,
            optionOne = "6",
            optionTwo = "9",
            optionThree = "3",
            optionFour = "12",
            correctAnswer = 2
        )
        questionsList.add(que8)

        val que9 = Question(8, "What is 10+7 ?",
            R.drawable.mathspng,
            optionOne = "17",
            optionTwo = "27",
            optionThree = "7",
            optionFour = "19",
            correctAnswer = 1
        )
        questionsList.add(que9)

        val que10 = Question(9, "What is 14+6 ?",
            R.drawable.mathspng,
            optionOne = "10",
            optionTwo = "20",
            optionThree = "40",
            optionFour = "16",
            correctAnswer = 2
        )
        questionsList.add(que10)




        return questionsList
    }



}