-module(ympa_erlang_client_parameter_value_constraints_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_parameter_value_constraints_dto/0]).

-type ympa_erlang_client_parameter_value_constraints_dto() ::
    #{ 'minValue' => float(),
       'maxValue' => float(),
       'maxLength' => integer()
     }.

encode(#{ 'minValue' := MinValue,
          'maxValue' := MaxValue,
          'maxLength' := MaxLength
        }) ->
    #{ 'minValue' => MinValue,
       'maxValue' => MaxValue,
       'maxLength' => MaxLength
     }.
