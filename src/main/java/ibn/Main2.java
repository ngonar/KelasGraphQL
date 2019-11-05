package ibn;

import graphql.ExecutionResult;
import graphql.GraphQL;


public class Main2 {
    
    public static void main(String[] args) {
       
        try {
            String queryQL = "{" +
                            "bookById(id: \"book-2\"){" +
                            " name" +
                            " id" +
                            "}" +
                            "}";
            
            
            GraphQLProvider gProv = new GraphQLProvider();
            gProv.init();
            GraphQL build = gProv.graphQL();
            ExecutionResult executionResult = build.execute(queryQL);

            System.out.println(executionResult.getData().toString());
            // Prints: {hello=world}
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
