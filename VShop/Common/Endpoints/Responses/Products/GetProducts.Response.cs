using System.Text.Json.Serialization;

namespace Common.Endpoints.Responses.Products;

public class GetProductsResponse
{
    [JsonPropertyName("id")] public string Id { get; set; }
    [JsonPropertyName("title")] public string Title { get; set; }
    [JsonPropertyName("price")] public decimal Price { get; set; }
}