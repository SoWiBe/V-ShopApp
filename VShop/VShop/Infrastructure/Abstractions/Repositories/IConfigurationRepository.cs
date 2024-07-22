namespace VShop.Infrastructure.Abstractions.Repositories;

public interface IConfigurationRepository
{
    string? ApiUrl { get; }
}