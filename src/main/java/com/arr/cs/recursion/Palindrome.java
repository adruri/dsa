package com.arr.cs.recursion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Palindrome {

    public static void main(String[] args) {
        String word = "Dennis, Nell, Edna, Leon, Nedra, Anita, Rolf, Nora, Alice, Carol, Leo, Jane, Reed, Dena, Dale, Basil, Rae, Penny, Lana, Dave, Denny, Lena, Ida, Bernadette, Ben, Ray, Lila, Nina, Jo, Ira, Mara, Sara, Mario, Jan, Ina, Lily, Arne, Bette, Dan, Reba, Diane, Lynn, Ed, Eva, Dana, Lynne, Pearl, Isabel, Ada, Ned, Dee, Rena, Joel, Lora, Cecil, Aaron, Flora, Tina, Arden, Noel, and Ellen sinned";
        String cleanWord = word.toLowerCase()
            .replace(" ", "")
            .replace(",", "");
        log.info("Is \"{}\" a palindrome?", word);
        log.info("{}", isPalindrome(cleanWord, 0, cleanWord.length() - 1));
    }

    static boolean isPalindrome(String word, int start, int end) {
        boolean areEqual = word.charAt(start) == word.charAt(end);

        if (end - start < 1 || !areEqual) {
            return areEqual;
        }

        return isPalindrome(word, start + 1, end - 1);
    }

}
