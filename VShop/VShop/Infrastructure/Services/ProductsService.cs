using Common;
using VShop.Infrastructure.Abstractions.Services;

namespace VShop.Infrastructure.Services;

public class ProductsService : IProductsService
{
    public IEnumerable<Product> GetProducts()
    {
        return new List<Product>();
    }
}