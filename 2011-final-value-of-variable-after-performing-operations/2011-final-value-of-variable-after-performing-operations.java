class Solution {

    final String ADDITION = "+";

    public int finalValueAfterOperations(String[] operations) {
        Map<String,String> operationMap = new HashMap<>();
        
        /**
            Map the Operations
         */
        operationMap.put("X++","+");
        operationMap.put("++X","+");
        operationMap.put("--X","-");
        operationMap.put("X--","-");

        String op = "";

        int result=0;

        /**
            Iterate through all the operations and perform the required operations 
            and save the result
         */
        for(String operation:operations){
            op = operationMap.get(operation);
            boolean isAddition = op.equals(ADDITION);
            result = op.equals(ADDITION)?++result:--result;
        }

        return result;
    }
}