-module(ympa_erlang_client_parameter_value_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_parameter_value_dto/0]).

-type ympa_erlang_client_parameter_value_dto() ::
    #{ 'parameterId' := integer(),
       'unitId' => integer(),
       'valueId' => integer(),
       'value' => binary()
     }.

encode(#{ 'parameterId' := ParameterId,
          'unitId' := UnitId,
          'valueId' := ValueId,
          'value' := Value
        }) ->
    #{ 'parameterId' => ParameterId,
       'unitId' => UnitId,
       'valueId' => ValueId,
       'value' => Value
     }.
