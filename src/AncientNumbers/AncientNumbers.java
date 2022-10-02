package AncientNumbers;

public class AncientNumbers {
    public int romanToInt(String s) {
        int[] solutionOne = CharsToNum(s);
        int solution = AnswerFinder(solutionOne);
        return solution;
    }

    public int[] CharsToNum(String number){
        int numbers[] = new int[number.length()];
        char[] values = number.toCharArray();
        for (int i = 0; i < number.length(); i++ ) {
            switch (number.toCharArray()[i]) {
                case 'I':
                    numbers[i] = 1;
                    break;
                case 'V':
                    numbers[i] = 5;
                    break;
                case 'X':
                    numbers[i] = 10;
                    break;
                case 'L':
                    numbers[i] = 50;
                    break;
                case 'C':
                    numbers[i] = 100;
                    break;
                case 'D':
                    numbers[i] = 500;
                    break;
                case 'M':
                    numbers[i] = 1000;
                    break;
            }
        }
        return numbers;
    }

    public int AnswerFinder(int[] numbers){
        int answer = 0;
        for (int i = 0; i < numbers.length; i++ ){
            if ((i+1) < numbers.length){
                if ((numbers[i+1] <= numbers[i]) || (numbers[i] == 0)){
                    answer += numbers[i];
                } else {
                    answer += (numbers[i+1]-numbers[i]);
                    numbers[i+1] = 0;
                }
            } else{
                answer += numbers[i];
            }
        }

        return answer;
    }
}

