package en.just.api.dto.mapper;

public interface GenericMapper<I, O> {
    O fromModel(I input);
    I fromDto(O output);
}
