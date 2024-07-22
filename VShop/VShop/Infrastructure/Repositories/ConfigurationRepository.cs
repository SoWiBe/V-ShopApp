using VShop.Infrastructure.Abstractions.Repositories;

namespace VShop.Infrastructure.Repositories;

public class ConfigurationRepository : IConfigurationRepository
{
    private readonly IConfiguration _configuration;

    public ConfigurationRepository(IConfiguration configuration)
    {
        _configuration = configuration;
    }

    public string? ApiUrl => _configuration[Fields.ApiUrl];
    
    public static class Fields
    {
        public const string ApiUrl = "api_url";
    }
}