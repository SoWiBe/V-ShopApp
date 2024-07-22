using Common;
using Common.Abstractions.Repositories;
using Common.Endpoints.Responses.Products;
using Common.Errors;
using VShop.Infrastructure.Abstractions.Repositories;
using VShop.Infrastructure.Abstractions.Services;

namespace VShop.Infrastructure.Services;

public class ProductsService : IProductsService
{
    private readonly IApiRepository _apiRepository;
    private readonly IConfigurationRepository _configurationRepository;

    public ProductsService(IApiRepository apiRepository, IConfigurationRepository configurationRepository)
    {
        _apiRepository = apiRepository;
        _configurationRepository = configurationRepository;
    }

    public async Task<ErrorOr<GetProductsResponse>> GetProducts()
    {
        var url = _configurationRepository.ApiUrl + "/api/v1/product";
        var response = await _apiRepository.GetResponseAsync<GetProductsResponse>(url);
        
        return response;
    }
    
    
}