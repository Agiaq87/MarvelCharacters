import 'package:marvel_character/generated/json/base/json_convert_content.dart';
import 'package:marvel_character/data/model/remote/base_response_entity.dart';

BaseResponseEntity $BaseResponseEntityFromJson(Map<String, dynamic> json) {
	final BaseResponseEntity baseResponseEntity = BaseResponseEntity();
	final String? code = jsonConvert.convert<String>(json['code']);
	if (code != null) {
		baseResponseEntity.code = code;
	}
	final String? status = jsonConvert.convert<String>(json['status']);
	if (status != null) {
		baseResponseEntity.status = status;
	}
	final String? copyright = jsonConvert.convert<String>(json['copyright']);
	if (copyright != null) {
		baseResponseEntity.copyright = copyright;
	}
	final String? attributionText = jsonConvert.convert<String>(json['attributionText']);
	if (attributionText != null) {
		baseResponseEntity.attributionText = attributionText;
	}
	final String? attributionHTML = jsonConvert.convert<String>(json['attributionHTML']);
	if (attributionHTML != null) {
		baseResponseEntity.attributionHTML = attributionHTML;
	}
	final BaseResponseData? data = jsonConvert.convert<BaseResponseData>(json['data']);
	if (data != null) {
		baseResponseEntity.data = data;
	}
	final String? etag = jsonConvert.convert<String>(json['etag']);
	if (etag != null) {
		baseResponseEntity.etag = etag;
	}
	return baseResponseEntity;
}

Map<String, dynamic> $BaseResponseEntityToJson(BaseResponseEntity entity) {
	final Map<String, dynamic> data = <String, dynamic>{};
	data['code'] = entity.code;
	data['status'] = entity.status;
	data['copyright'] = entity.copyright;
	data['attributionText'] = entity.attributionText;
	data['attributionHTML'] = entity.attributionHTML;
	data['data'] = entity.data?.toJson();
	data['etag'] = entity.etag;
	return data;
}

BaseResponseData $BaseResponseDataFromJson(Map<String, dynamic> json) {
	final BaseResponseData baseResponseData = BaseResponseData();
	final String? offset = jsonConvert.convert<String>(json['offset']);
	if (offset != null) {
		baseResponseData.offset = offset;
	}
	final String? limit = jsonConvert.convert<String>(json['limit']);
	if (limit != null) {
		baseResponseData.limit = limit;
	}
	final String? total = jsonConvert.convert<String>(json['total']);
	if (total != null) {
		baseResponseData.total = total;
	}
	final String? count = jsonConvert.convert<String>(json['count']);
	if (count != null) {
		baseResponseData.count = count;
	}
	final List<BaseResponseDataResults>? results = jsonConvert.convertListNotNull<BaseResponseDataResults>(json['results']);
	if (results != null) {
		baseResponseData.results = results;
	}
	return baseResponseData;
}

Map<String, dynamic> $BaseResponseDataToJson(BaseResponseData entity) {
	final Map<String, dynamic> data = <String, dynamic>{};
	data['offset'] = entity.offset;
	data['limit'] = entity.limit;
	data['total'] = entity.total;
	data['count'] = entity.count;
	data['results'] =  entity.results?.map((v) => v.toJson()).toList();
	return data;
}

BaseResponseDataResults $BaseResponseDataResultsFromJson(Map<String, dynamic> json) {
	final BaseResponseDataResults baseResponseDataResults = BaseResponseDataResults();
	final String? id = jsonConvert.convert<String>(json['id']);
	if (id != null) {
		baseResponseDataResults.id = id;
	}
	final String? name = jsonConvert.convert<String>(json['name']);
	if (name != null) {
		baseResponseDataResults.name = name;
	}
	final String? description = jsonConvert.convert<String>(json['description']);
	if (description != null) {
		baseResponseDataResults.description = description;
	}
	final String? modified = jsonConvert.convert<String>(json['modified']);
	if (modified != null) {
		baseResponseDataResults.modified = modified;
	}
	final String? resourceURI = jsonConvert.convert<String>(json['resourceURI']);
	if (resourceURI != null) {
		baseResponseDataResults.resourceURI = resourceURI;
	}
	final List<BaseResponseDataResultsUrls>? urls = jsonConvert.convertListNotNull<BaseResponseDataResultsUrls>(json['urls']);
	if (urls != null) {
		baseResponseDataResults.urls = urls;
	}
	final BaseResponseDataResultsThumbnail? thumbnail = jsonConvert.convert<BaseResponseDataResultsThumbnail>(json['thumbnail']);
	if (thumbnail != null) {
		baseResponseDataResults.thumbnail = thumbnail;
	}
	final BaseResponseDataResultsComics? comics = jsonConvert.convert<BaseResponseDataResultsComics>(json['comics']);
	if (comics != null) {
		baseResponseDataResults.comics = comics;
	}
	final BaseResponseDataResultsStories? stories = jsonConvert.convert<BaseResponseDataResultsStories>(json['stories']);
	if (stories != null) {
		baseResponseDataResults.stories = stories;
	}
	final BaseResponseDataResultsEvents? events = jsonConvert.convert<BaseResponseDataResultsEvents>(json['events']);
	if (events != null) {
		baseResponseDataResults.events = events;
	}
	final BaseResponseDataResultsSeries? series = jsonConvert.convert<BaseResponseDataResultsSeries>(json['series']);
	if (series != null) {
		baseResponseDataResults.series = series;
	}
	return baseResponseDataResults;
}

Map<String, dynamic> $BaseResponseDataResultsToJson(BaseResponseDataResults entity) {
	final Map<String, dynamic> data = <String, dynamic>{};
	data['id'] = entity.id;
	data['name'] = entity.name;
	data['description'] = entity.description;
	data['modified'] = entity.modified;
	data['resourceURI'] = entity.resourceURI;
	data['urls'] =  entity.urls?.map((v) => v.toJson()).toList();
	data['thumbnail'] = entity.thumbnail?.toJson();
	data['comics'] = entity.comics?.toJson();
	data['stories'] = entity.stories?.toJson();
	data['events'] = entity.events?.toJson();
	data['series'] = entity.series?.toJson();
	return data;
}

BaseResponseDataResultsUrls $BaseResponseDataResultsUrlsFromJson(Map<String, dynamic> json) {
	final BaseResponseDataResultsUrls baseResponseDataResultsUrls = BaseResponseDataResultsUrls();
	final String? type = jsonConvert.convert<String>(json['type']);
	if (type != null) {
		baseResponseDataResultsUrls.type = type;
	}
	final String? url = jsonConvert.convert<String>(json['url']);
	if (url != null) {
		baseResponseDataResultsUrls.url = url;
	}
	return baseResponseDataResultsUrls;
}

Map<String, dynamic> $BaseResponseDataResultsUrlsToJson(BaseResponseDataResultsUrls entity) {
	final Map<String, dynamic> data = <String, dynamic>{};
	data['type'] = entity.type;
	data['url'] = entity.url;
	return data;
}

BaseResponseDataResultsThumbnail $BaseResponseDataResultsThumbnailFromJson(Map<String, dynamic> json) {
	final BaseResponseDataResultsThumbnail baseResponseDataResultsThumbnail = BaseResponseDataResultsThumbnail();
	final String? path = jsonConvert.convert<String>(json['path']);
	if (path != null) {
		baseResponseDataResultsThumbnail.path = path;
	}
	final String? extension = jsonConvert.convert<String>(json['extension']);
	if (extension != null) {
		baseResponseDataResultsThumbnail.extension = extension;
	}
	return baseResponseDataResultsThumbnail;
}

Map<String, dynamic> $BaseResponseDataResultsThumbnailToJson(BaseResponseDataResultsThumbnail entity) {
	final Map<String, dynamic> data = <String, dynamic>{};
	data['path'] = entity.path;
	data['extension'] = entity.extension;
	return data;
}

BaseResponseDataResultsComics $BaseResponseDataResultsComicsFromJson(Map<String, dynamic> json) {
	final BaseResponseDataResultsComics baseResponseDataResultsComics = BaseResponseDataResultsComics();
	final String? available = jsonConvert.convert<String>(json['available']);
	if (available != null) {
		baseResponseDataResultsComics.available = available;
	}
	final String? returned = jsonConvert.convert<String>(json['returned']);
	if (returned != null) {
		baseResponseDataResultsComics.returned = returned;
	}
	final String? collectionURI = jsonConvert.convert<String>(json['collectionURI']);
	if (collectionURI != null) {
		baseResponseDataResultsComics.collectionURI = collectionURI;
	}
	final List<BaseResponseDataResultsComicsItems>? items = jsonConvert.convertListNotNull<BaseResponseDataResultsComicsItems>(json['items']);
	if (items != null) {
		baseResponseDataResultsComics.items = items;
	}
	return baseResponseDataResultsComics;
}

Map<String, dynamic> $BaseResponseDataResultsComicsToJson(BaseResponseDataResultsComics entity) {
	final Map<String, dynamic> data = <String, dynamic>{};
	data['available'] = entity.available;
	data['returned'] = entity.returned;
	data['collectionURI'] = entity.collectionURI;
	data['items'] =  entity.items?.map((v) => v.toJson()).toList();
	return data;
}

BaseResponseDataResultsComicsItems $BaseResponseDataResultsComicsItemsFromJson(Map<String, dynamic> json) {
	final BaseResponseDataResultsComicsItems baseResponseDataResultsComicsItems = BaseResponseDataResultsComicsItems();
	final String? resourceURI = jsonConvert.convert<String>(json['resourceURI']);
	if (resourceURI != null) {
		baseResponseDataResultsComicsItems.resourceURI = resourceURI;
	}
	final String? name = jsonConvert.convert<String>(json['name']);
	if (name != null) {
		baseResponseDataResultsComicsItems.name = name;
	}
	return baseResponseDataResultsComicsItems;
}

Map<String, dynamic> $BaseResponseDataResultsComicsItemsToJson(BaseResponseDataResultsComicsItems entity) {
	final Map<String, dynamic> data = <String, dynamic>{};
	data['resourceURI'] = entity.resourceURI;
	data['name'] = entity.name;
	return data;
}

BaseResponseDataResultsStories $BaseResponseDataResultsStoriesFromJson(Map<String, dynamic> json) {
	final BaseResponseDataResultsStories baseResponseDataResultsStories = BaseResponseDataResultsStories();
	final String? available = jsonConvert.convert<String>(json['available']);
	if (available != null) {
		baseResponseDataResultsStories.available = available;
	}
	final String? returned = jsonConvert.convert<String>(json['returned']);
	if (returned != null) {
		baseResponseDataResultsStories.returned = returned;
	}
	final String? collectionURI = jsonConvert.convert<String>(json['collectionURI']);
	if (collectionURI != null) {
		baseResponseDataResultsStories.collectionURI = collectionURI;
	}
	final List<BaseResponseDataResultsStoriesItems>? items = jsonConvert.convertListNotNull<BaseResponseDataResultsStoriesItems>(json['items']);
	if (items != null) {
		baseResponseDataResultsStories.items = items;
	}
	return baseResponseDataResultsStories;
}

Map<String, dynamic> $BaseResponseDataResultsStoriesToJson(BaseResponseDataResultsStories entity) {
	final Map<String, dynamic> data = <String, dynamic>{};
	data['available'] = entity.available;
	data['returned'] = entity.returned;
	data['collectionURI'] = entity.collectionURI;
	data['items'] =  entity.items?.map((v) => v.toJson()).toList();
	return data;
}

BaseResponseDataResultsStoriesItems $BaseResponseDataResultsStoriesItemsFromJson(Map<String, dynamic> json) {
	final BaseResponseDataResultsStoriesItems baseResponseDataResultsStoriesItems = BaseResponseDataResultsStoriesItems();
	final String? resourceURI = jsonConvert.convert<String>(json['resourceURI']);
	if (resourceURI != null) {
		baseResponseDataResultsStoriesItems.resourceURI = resourceURI;
	}
	final String? name = jsonConvert.convert<String>(json['name']);
	if (name != null) {
		baseResponseDataResultsStoriesItems.name = name;
	}
	final String? type = jsonConvert.convert<String>(json['type']);
	if (type != null) {
		baseResponseDataResultsStoriesItems.type = type;
	}
	return baseResponseDataResultsStoriesItems;
}

Map<String, dynamic> $BaseResponseDataResultsStoriesItemsToJson(BaseResponseDataResultsStoriesItems entity) {
	final Map<String, dynamic> data = <String, dynamic>{};
	data['resourceURI'] = entity.resourceURI;
	data['name'] = entity.name;
	data['type'] = entity.type;
	return data;
}

BaseResponseDataResultsEvents $BaseResponseDataResultsEventsFromJson(Map<String, dynamic> json) {
	final BaseResponseDataResultsEvents baseResponseDataResultsEvents = BaseResponseDataResultsEvents();
	final String? available = jsonConvert.convert<String>(json['available']);
	if (available != null) {
		baseResponseDataResultsEvents.available = available;
	}
	final String? returned = jsonConvert.convert<String>(json['returned']);
	if (returned != null) {
		baseResponseDataResultsEvents.returned = returned;
	}
	final String? collectionURI = jsonConvert.convert<String>(json['collectionURI']);
	if (collectionURI != null) {
		baseResponseDataResultsEvents.collectionURI = collectionURI;
	}
	final List<BaseResponseDataResultsEventsItems>? items = jsonConvert.convertListNotNull<BaseResponseDataResultsEventsItems>(json['items']);
	if (items != null) {
		baseResponseDataResultsEvents.items = items;
	}
	return baseResponseDataResultsEvents;
}

Map<String, dynamic> $BaseResponseDataResultsEventsToJson(BaseResponseDataResultsEvents entity) {
	final Map<String, dynamic> data = <String, dynamic>{};
	data['available'] = entity.available;
	data['returned'] = entity.returned;
	data['collectionURI'] = entity.collectionURI;
	data['items'] =  entity.items?.map((v) => v.toJson()).toList();
	return data;
}

BaseResponseDataResultsEventsItems $BaseResponseDataResultsEventsItemsFromJson(Map<String, dynamic> json) {
	final BaseResponseDataResultsEventsItems baseResponseDataResultsEventsItems = BaseResponseDataResultsEventsItems();
	final String? resourceURI = jsonConvert.convert<String>(json['resourceURI']);
	if (resourceURI != null) {
		baseResponseDataResultsEventsItems.resourceURI = resourceURI;
	}
	final String? name = jsonConvert.convert<String>(json['name']);
	if (name != null) {
		baseResponseDataResultsEventsItems.name = name;
	}
	return baseResponseDataResultsEventsItems;
}

Map<String, dynamic> $BaseResponseDataResultsEventsItemsToJson(BaseResponseDataResultsEventsItems entity) {
	final Map<String, dynamic> data = <String, dynamic>{};
	data['resourceURI'] = entity.resourceURI;
	data['name'] = entity.name;
	return data;
}

BaseResponseDataResultsSeries $BaseResponseDataResultsSeriesFromJson(Map<String, dynamic> json) {
	final BaseResponseDataResultsSeries baseResponseDataResultsSeries = BaseResponseDataResultsSeries();
	final String? available = jsonConvert.convert<String>(json['available']);
	if (available != null) {
		baseResponseDataResultsSeries.available = available;
	}
	final String? returned = jsonConvert.convert<String>(json['returned']);
	if (returned != null) {
		baseResponseDataResultsSeries.returned = returned;
	}
	final String? collectionURI = jsonConvert.convert<String>(json['collectionURI']);
	if (collectionURI != null) {
		baseResponseDataResultsSeries.collectionURI = collectionURI;
	}
	final List<BaseResponseDataResultsSeriesItems>? items = jsonConvert.convertListNotNull<BaseResponseDataResultsSeriesItems>(json['items']);
	if (items != null) {
		baseResponseDataResultsSeries.items = items;
	}
	return baseResponseDataResultsSeries;
}

Map<String, dynamic> $BaseResponseDataResultsSeriesToJson(BaseResponseDataResultsSeries entity) {
	final Map<String, dynamic> data = <String, dynamic>{};
	data['available'] = entity.available;
	data['returned'] = entity.returned;
	data['collectionURI'] = entity.collectionURI;
	data['items'] =  entity.items?.map((v) => v.toJson()).toList();
	return data;
}

BaseResponseDataResultsSeriesItems $BaseResponseDataResultsSeriesItemsFromJson(Map<String, dynamic> json) {
	final BaseResponseDataResultsSeriesItems baseResponseDataResultsSeriesItems = BaseResponseDataResultsSeriesItems();
	final String? resourceURI = jsonConvert.convert<String>(json['resourceURI']);
	if (resourceURI != null) {
		baseResponseDataResultsSeriesItems.resourceURI = resourceURI;
	}
	final String? name = jsonConvert.convert<String>(json['name']);
	if (name != null) {
		baseResponseDataResultsSeriesItems.name = name;
	}
	return baseResponseDataResultsSeriesItems;
}

Map<String, dynamic> $BaseResponseDataResultsSeriesItemsToJson(BaseResponseDataResultsSeriesItems entity) {
	final Map<String, dynamic> data = <String, dynamic>{};
	data['resourceURI'] = entity.resourceURI;
	data['name'] = entity.name;
	return data;
}