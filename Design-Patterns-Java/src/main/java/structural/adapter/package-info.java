package structural.adapter;
/**
*Adapter design pattern is one of the structural design pattern
* and its used so that two unrelated interfaces can work together. 
*The object that joins these unrelated interface is called an Adapter.
*/

/**
 * Here we have a ISubstation interface and ITransformer interface.
 * generally substation interface provides the power to the client. But the catch is it porvides 
 * default 11k power to any client regardless
 * But our client needs the variable power so client extra transformer functionality
 * 
 * So now we use the adapter to combine the both interfaces so that the client can extend the same 
 * Substation interface but he also can get the required lower amounts of power from transformer.
 * 
 */
