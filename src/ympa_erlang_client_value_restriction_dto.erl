-module(ympa_erlang_client_value_restriction_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_value_restriction_dto/0]).

-type ympa_erlang_client_value_restriction_dto() ::
    #{ 'limitingParameterId' := integer(),
       'limitedValues' := list()
     }.

encode(#{ 'limitingParameterId' := LimitingParameterId,
          'limitedValues' := LimitedValues
        }) ->
    #{ 'limitingParameterId' => LimitingParameterId,
       'limitedValues' => LimitedValues
     }.
