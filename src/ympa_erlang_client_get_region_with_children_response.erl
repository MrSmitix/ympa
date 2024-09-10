-module(ympa_erlang_client_get_region_with_children_response).

-export([encode/1]).

-export_type([ympa_erlang_client_get_region_with_children_response/0]).

-type ympa_erlang_client_get_region_with_children_response() ::
    #{ 'pager' => ympa_erlang_client_flipping_pager_dto:ympa_erlang_client_flipping_pager_dto(),
       'regions' => ympa_erlang_client_region_dto:ympa_erlang_client_region_dto()
     }.

encode(#{ 'pager' := Pager,
          'regions' := Regions
        }) ->
    #{ 'pager' => Pager,
       'regions' => Regions
     }.
