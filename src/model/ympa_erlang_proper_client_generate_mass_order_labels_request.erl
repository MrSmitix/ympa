-module(ympa_erlang_proper_client_generate_mass_order_labels_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_generate_mass_order_labels_request/0]).

-export([ympa_erlang_proper_client_generate_mass_order_labels_request/1]).

-export_type([ympa_erlang_proper_client_generate_mass_order_labels_request/0]).

-type ympa_erlang_proper_client_generate_mass_order_labels_request() ::
  [ {'businessId', integer() }
  | {'orderIds', list(integer()) }
  ].


ympa_erlang_proper_client_generate_mass_order_labels_request() ->
    ympa_erlang_proper_client_generate_mass_order_labels_request([]).

ympa_erlang_proper_client_generate_mass_order_labels_request(Fields) ->
  Default = [ {'businessId', integer() }
            , {'orderIds', list(integer(), 1, 1000) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

