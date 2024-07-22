using Common;

namespace VShop.Infrastructure.Abstractions.Services;

public interface IProductsService
{
    Task<IEnumerable<Product> > GetProducts();
}