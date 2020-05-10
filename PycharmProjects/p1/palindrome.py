def reverse(s):
	return s[::-1]


def verifyPalindrome(str):

	if (str==reverse(str)):
		return True
	return False


# main function
words = ["aaa","a","aa","aba","abcdcba","abccba","aabbcaa","abcddba","abcabc"]

for i in range(0,len(words)-1):
	ans=verifyPalindrome(words[i])
	if ans==1 :
		print(words[i]+" is palindrome")



