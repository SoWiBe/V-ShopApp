using Common;
using Common.Abstractions.Repositories;
using VShop.Infrastructure.Abstractions.Services;

namespace VShop.Infrastructure.Services;

public class ProductsService : IProductsService
{
    private readonly IApiRepository _apiRepository;
    private readonly IConfiguration _configuration;

    public ProductsService(IApiRepository apiRepository, IConfiguration configuration)
    {
        _apiRepository = apiRepository;
        _configuration = configuration;
    }

    public async Task<IEnumerable<Product> > GetProducts()
    {
        var url = _configuration[];
            var response = await _apiRepository.GetResponseAsync<>(url);
        return new List<Product>();
    }
}