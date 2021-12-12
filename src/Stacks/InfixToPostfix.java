package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {

    public static void InFixToPostFix()
    {
        Stack<Character> s = new Stack<Character>();
        String expression;
        Character token;
        int i=0;

        Scanner sc = new Scanner(System.in);
        expression = sc.next();

        while ((token = expression.charAt(i++)) != '=' )
        {
            if (token >= 'a' && token <= 'z' ){
                System.out.print(token + " ");

            }else{
                switch (token)
                {
                    case ')':
                        while ( !s.empty() && s.peek() != '(' )
                            { System.out.print(s.pop() + " "); }
                        s.pop();
                        break;

                    case '(':
                        s.push(token);
                        break;
                    case '^':
                        while ( !s.empty() && !(s.peek() == '^' || s.peek() == '('))
                            { System.out.print(s.pop()); }
                        s.push(token);
                        break;
                    case '*':
                    case '/':
                        while ( !s.empty() && s.peek() != '+' && s.peek() != '-' && s.peek() != '(' )
                            { System.out.print(s.pop()); }
                        s.push(token);
                        break;
                    case '+':
                    case '-':
                        while ( !s.empty() && s.peek() != '(' )
                            { System.out.print(s.pop() + " "); }
                        s.push(token);
                        break;
                }
            }
        }

    }


    public static void main(String[] args) {

        InFixToPostFix();


    }

}
