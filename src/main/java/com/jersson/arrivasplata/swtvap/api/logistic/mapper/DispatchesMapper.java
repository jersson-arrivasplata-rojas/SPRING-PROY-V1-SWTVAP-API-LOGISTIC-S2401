package com.jersson.arrivasplata.swtvap.api.logistic.mapper;

import com.jersson.arrivasplata.swtvap.api.logistic.model.Dispatches;
import com.jersson.arrivasplata.swtvap.api.logistic.model.DispatchesRequest;
import com.jersson.arrivasplata.swtvap.api.logistic.model.DispatchesResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")

public interface DispatchesMapper {

    DispatchesMapper INSTANCE = Mappers.getMapper(DispatchesMapper.class);

    Dispatches dispatchesRequestToDispatches(DispatchesRequest dispatchesRequest);

    DispatchesRequest dispatchesToDispatchesRequest(Dispatches dispatches);

    DispatchesResponse dispatchesToDispatchesResponse(Dispatches dispatches);

    List<DispatchesResponse> mapDispatchesToResponses(List<Dispatches> dispatches);
}
