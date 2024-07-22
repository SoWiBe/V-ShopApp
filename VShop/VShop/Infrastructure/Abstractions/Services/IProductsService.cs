using Common;

namespace VShop.Infrastructure.Abstractions.Services;

public interface IProductsService
{
    IEnumerable<Product> GetProducts();
}