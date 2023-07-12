import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Iterator;

class Solution {
    public int[] solution(int[][] users, int[] emoticons) {
        int maxPlusUsers = 0;
        int maxTotalSales = 0;
        int[] sales = {10, 20, 30, 40};
        int[] emoticons_sales = new int[emoticons.length];
        Set<int[]> salesSet = new LinkedHashSet<>();
        
        for(int i = 0;i <= emoticons.length * 3;i++) {
            dps(salesSet,emoticons_sales,i,0,0);
        }
        
        Iterator<int[]> salesIterator = salesSet.iterator();
        while(salesIterator.hasNext()) {
            int[] sale = salesIterator.next();
            int plusUsers = 0;
            int totalSales = 0;
            
            for(int[] user : users) {
                int price = 0;
                for(int i = 0;i < emoticons.length;i++) {
                    if(user[0] <= sales[sale[i]]) {
                        price += emoticons[i] * (100 - sales[sale[i]]) / 100;
                    }
                }
                
                if(user[1] <= price) plusUsers++;
                else totalSales += price;
            }
            
            if(maxPlusUsers < plusUsers) {
                maxPlusUsers = plusUsers;
                maxTotalSales = totalSales;
            }else {
                if(maxPlusUsers == plusUsers) maxTotalSales = Math.max(maxTotalSales,totalSales);
            }
        }
        
        return new int[]{maxPlusUsers,maxTotalSales};
    }
    
    public void dps(Set<int[]> salesSet,int[] emoticons_sales,int n,int count,int index) {
        if(n == count) {
            salesSet.add(emoticons_sales.clone());
            return;
        }
        for(int i = index;i < emoticons_sales.length;i++) {
            if(emoticons_sales[i] < 3) {
                emoticons_sales[i]++;
                dps(salesSet,emoticons_sales,n,count+1,i);
                emoticons_sales[i]--;   
            }
        }
    }
}