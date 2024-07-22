using System.Text.Json.Serialization;

namespace Common;

public class Product
{
    [JsonPropertyName("id")] public string Id { get; set; }
    [JsonPropertyName("title")] public string Title { get; set; }
    [JsonPropertyName("price")] public double Price { get; set; }
}