class Solution:
    # def maxProfit(self, prices: List[int]) -> int:
    #     calculated = []
    #     buy = prices[0]
    #     sell = prices[0]
    #     for i in range(1, len(prices)):
    #       if (prices[i] < buy):
    #         calculated.append(sell-buy)
    #         buy = prices[i]
    #         sell = prices[i]
    #       elif (prices[i] > sell):
    #         sell = prices[i]
    #         calculated.append(sell-buy)
    #     return 0 if (len(calculated) == 0) else max(calculated)

    def maxProfit(self, prices: List[int]) -> int:
        maxsofar = 0
        buy = prices[0]
        sell = prices[0]
        for i in range(1, len(prices)):
          if (prices[i] < buy):
            maxsofar = maxsofar if ((sell-buy) <= maxsofar) else (sell-buy)
            buy = prices[i]
            sell = prices[i]
          elif (prices[i] > sell):
            sell = prices[i]
            maxsofar = maxsofar if ((sell-buy) <= maxsofar) else (sell-buy)
        return maxsofar
    