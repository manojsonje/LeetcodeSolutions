class Solution {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalCost = 0, totalGas = 0, currentGas = 0;
        int start = 0;
        int n = gas.length;
        for(int i = 0; i < n; i++){
            totalGas += gas[i] - cost[i];
            currentGas += gas[i] - cost[i];
            
            if(currentGas < 0){
                currentGas = 0;
                start = i+1;
            }
        }
        return (totalGas < 0) ? -1 : start;
    }
}