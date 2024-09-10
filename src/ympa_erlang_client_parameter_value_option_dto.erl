-module(ympa_erlang_client_parameter_value_option_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_parameter_value_option_dto/0]).

-type ympa_erlang_client_parameter_value_option_dto() ::
    #{ 'id' := integer(),
       'value' := binary(),
       'description' => binary()
     }.

encode(#{ 'id' := Id,
          'value' := Value,
          'description' := Description
        }) ->
    #{ 'id' => Id,
       'value' => Value,
       'description' => Description
     }.
