using Common.Errors;

namespace Common.Abstractions.Errors;

public interface IErrorOr
{
    List<Error>? Errors { get; }
    bool IsError { get; }
}