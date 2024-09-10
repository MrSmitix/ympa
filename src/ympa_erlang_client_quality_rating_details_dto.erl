-module(ympa_erlang_client_quality_rating_details_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_quality_rating_details_dto/0]).

-type ympa_erlang_client_quality_rating_details_dto() ::
    #{ 'affectedOrders' := list()
     }.

encode(#{ 'affectedOrders' := AffectedOrders
        }) ->
    #{ 'affectedOrders' => AffectedOrders
     }.
