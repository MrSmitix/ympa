-module(ympa_erlang_client_quality_rating_component_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_quality_rating_component_dto/0]).

-type ympa_erlang_client_quality_rating_component_dto() ::
    #{ 'value' := float(),
       'componentType' := ympa_erlang_client_quality_rating_component_type:ympa_erlang_client_quality_rating_component_type()
     }.

encode(#{ 'value' := Value,
          'componentType' := ComponentType
        }) ->
    #{ 'value' => Value,
       'componentType' => ComponentType
     }.
