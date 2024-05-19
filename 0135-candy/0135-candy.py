class Solution:
    def candy(self, ratings: List[int]) -> int:
        flag = False
        for m in range(1, len(ratings)):
            if (ratings[m] != ratings[m-1] - 1):
                flag = True
                break
        
        if (not flag and len(ratings) > 1):
            return sum(ratings)

        candies = [1] * (len(ratings))
        for i in range(1, len(ratings)):
            if (ratings[i] > ratings[i-1]):
                candies[i] = candies[i-1] + 1
            else:
                for j in range(i, 0, -1):
                    if ((ratings[j-1] > ratings[j]) and (candies[j-1] == candies[j])):
                        candies[j-1] += 1
                    else:
                        break
        print(candies)
        return sum(candies)