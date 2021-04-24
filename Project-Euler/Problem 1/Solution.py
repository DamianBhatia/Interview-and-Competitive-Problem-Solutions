import math

''' Want all multiples of 3 and 5 so the numbers will look like 3*i and 5*i where
    i is a natural number. Multiples of both 3 and 5 will look like 15*i. To find the 
    sum under 1000 we want to add up all the multiples of 3 and all multiples of 5
    and then subtract all multiples of 15 since they will be overcounted. Can achieve this
    by doing simple summation
'''


''' Get sum of all multiples of 3 and 5 that are smaller than n. '''
def getSum(n):
    # number of multiples of 3 under n
    n1 = (n-1) // 3 
    # number of multiples of 5 under n
    n2 = (n-1) // 5
    # number of multiples of 15 under n
    n3 = (n-1) // 15
    
    # summation formula
    return 3 * sum_n(n1) + 5 *sum_n(n2) - 15 * sum_n(n3)
    
    
''' Summation formula for i = 1 to n. '''
def sum_n(n):
    return (n * (n+1) / 2)
    
    
print(getSum(1000))
