import math

def add(number):
    n = len(number)
    number[n-1]+=1;
    carry = number[n - 1] / 10
    number[n - 1] %= 10


    for i in range(n-2,-1,-1):
        if (carry == 1):
           number[i] += 1
           carry = number[i]/10
           number[i] %= 10


    if (carry == 1):
      number[0]=1

# driver code
vect1=[1, 2, 3]
vect2=[1, 2, 0]
vect3=[1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2]
vect4=[1, 9, 9]
vect5=[9, 9]

add(vect1)
for  i in range(0, len(vect1)):
     print(vect1[i] ,end= " ")

print()


add(vect2)
for  i in range(0, len(vect2)):
     print(vect2[i] ,end= " ")

print()

add(vect3)
for i in range(0, len(vect3)):
   print(vect3[i], end=" ")

print()

add(vect4)
for i in range(0, len(vect4)):
       print(vect4[i], end=" ")

print()

add(vect5)
for  i in range(0, len(vect5)):
     print(vect5[i] ,end= " ")