using System.Text.Json.Serialization;

namespace Common.Endpoints.Responses.Products;

public class GetProductsResponse
{
    public IEnumerable<Product> Products { get; set; }
}