package org.example;

import graphql.kickstart.servlet.GraphQLConfiguration;
import graphql.kickstart.servlet.GraphQLHttpServlet;

import static graphql.schema.idl.RuntimeWiring.newRuntimeWiring;

public class HelloGraphQLServlet extends GraphQLHttpServlet {

    @Override
    protected GraphQLConfiguration getConfiguration() {
        return GraphQLConfigurationProvider.getInstance().getConfiguration();
    }
}
//@WebServlet(name = "HelloGraphQLServlet", urlPatterns = {"graphql/*"}, loadOnStartup = 1)
//public class HelloGraphQLServlet extends GraphQLHttpServlet {
//
//    @Override
//    protected GraphQLConfiguration getConfiguration() {
//        return GraphQLConfiguration.with(createSchema()).build();
//    }
//
//    private GraphQLSchema createSchema() {
//        String schema = "type Query{hello: String}";
//
//        SchemaParser schemaParser = new SchemaParser();
//        TypeDefinitionRegistry typeDefinitionRegistry = schemaParser.parse(schema);
//
//        RuntimeWiring runtimeWiring = newRuntimeWiring()
//                .type("Query", builder -> builder.dataFetcher("hello", new StaticDataFetcher("world")))
//                .build();
//
//        SchemaGenerator schemaGenerator = new SchemaGenerator();
//        return schemaGenerator.makeExecutableSchema(typeDefinitionRegistry, runtimeWiring);
//    }
//
//}


