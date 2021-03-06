/* tslint:disable */
/* eslint-disable */
/**
 * Calendar API
 * API for maintaining Calendar
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import globalAxios, { AxiosPromise, AxiosInstance, AxiosRequestConfig } from 'axios';
import { Configuration } from '../configuration';
// Some imports not used depending on template conditions
// @ts-ignore
import { DUMMY_BASE_URL, assertParamExists, setApiKeyToObject, setBasicAuthToObject, setBearerAuthToObject, setOAuthToObject, setSearchParams, serializeDataIfNeeded, toPathString, createRequestFunction } from '../common';
// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS, RequestArgs, BaseAPI, RequiredError } from '../base';
// @ts-ignore
import { BaseCalendarDto } from '../models';
// @ts-ignore
import { CalendarDto } from '../models';
// @ts-ignore
import { ErrorData } from '../models';
// @ts-ignore
import { TotalCalendarDto } from '../models';
/**
 * DefaultApi - axios parameter creator
 * @export
 */
export const DefaultApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * create a new Calendar
         * @param {BaseCalendarDto} baseCalendarDto 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createCalendar: async (baseCalendarDto: BaseCalendarDto, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'baseCalendarDto' is not null or undefined
            assertParamExists('createCalendar', 'baseCalendarDto', baseCalendarDto)
            const localVarPath = `/test/calendar`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;


    
            localVarHeaderParameter['Content-Type'] = 'application/json';

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            localVarRequestOptions.data = serializeDataIfNeeded(baseCalendarDto, localVarRequestOptions, configuration)

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Delete a Calendar
         * @param {number} calendarId The Calendar id
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteCalendarById: async (calendarId: number, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'calendarId' is not null or undefined
            assertParamExists('deleteCalendarById', 'calendarId', calendarId)
            const localVarPath = `/test/calendar/{calendarId}`
                .replace(`{${"calendarId"}}`, encodeURIComponent(String(calendarId)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'DELETE', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;


    
            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Returns all Calendar with their data
         * @param {string} [date] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getCalendar: async (date?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/test/calendar`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (date !== undefined) {
                localVarQueryParameter['date'] = date;
            }


    
            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Modify a Calendar
         * @param {number} calendarId The Calendar id
         * @param {BaseCalendarDto} baseCalendarDto 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        updateCalendarById: async (calendarId: number, baseCalendarDto: BaseCalendarDto, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'calendarId' is not null or undefined
            assertParamExists('updateCalendarById', 'calendarId', calendarId)
            // verify required parameter 'baseCalendarDto' is not null or undefined
            assertParamExists('updateCalendarById', 'baseCalendarDto', baseCalendarDto)
            const localVarPath = `/test/calendar/{calendarId}`
                .replace(`{${"calendarId"}}`, encodeURIComponent(String(calendarId)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'PUT', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;


    
            localVarHeaderParameter['Content-Type'] = 'application/json';

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            localVarRequestOptions.data = serializeDataIfNeeded(baseCalendarDto, localVarRequestOptions, configuration)

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * DefaultApi - functional programming interface
 * @export
 */
export const DefaultApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = DefaultApiAxiosParamCreator(configuration)
    return {
        /**
         * create a new Calendar
         * @param {BaseCalendarDto} baseCalendarDto 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async createCalendar(baseCalendarDto: BaseCalendarDto, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<CalendarDto>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.createCalendar(baseCalendarDto, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Delete a Calendar
         * @param {number} calendarId The Calendar id
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async deleteCalendarById(calendarId: number, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<void>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.deleteCalendarById(calendarId, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Returns all Calendar with their data
         * @param {string} [date] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getCalendar(date?: string, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<TotalCalendarDto>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getCalendar(date, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Modify a Calendar
         * @param {number} calendarId The Calendar id
         * @param {BaseCalendarDto} baseCalendarDto 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async updateCalendarById(calendarId: number, baseCalendarDto: BaseCalendarDto, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<CalendarDto>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.updateCalendarById(calendarId, baseCalendarDto, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * DefaultApi - factory interface
 * @export
 */
export const DefaultApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = DefaultApiFp(configuration)
    return {
        /**
         * create a new Calendar
         * @param {BaseCalendarDto} baseCalendarDto 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createCalendar(baseCalendarDto: BaseCalendarDto, options?: any): AxiosPromise<CalendarDto> {
            return localVarFp.createCalendar(baseCalendarDto, options).then((request) => request(axios, basePath));
        },
        /**
         * Delete a Calendar
         * @param {number} calendarId The Calendar id
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteCalendarById(calendarId: number, options?: any): AxiosPromise<void> {
            return localVarFp.deleteCalendarById(calendarId, options).then((request) => request(axios, basePath));
        },
        /**
         * Returns all Calendar with their data
         * @param {string} [date] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getCalendar(date?: string, options?: any): AxiosPromise<TotalCalendarDto> {
            return localVarFp.getCalendar(date, options).then((request) => request(axios, basePath));
        },
        /**
         * Modify a Calendar
         * @param {number} calendarId The Calendar id
         * @param {BaseCalendarDto} baseCalendarDto 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        updateCalendarById(calendarId: number, baseCalendarDto: BaseCalendarDto, options?: any): AxiosPromise<CalendarDto> {
            return localVarFp.updateCalendarById(calendarId, baseCalendarDto, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * DefaultApi - object-oriented interface
 * @export
 * @class DefaultApi
 * @extends {BaseAPI}
 */
export class DefaultApi extends BaseAPI {
    /**
     * create a new Calendar
     * @param {BaseCalendarDto} baseCalendarDto 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof DefaultApi
     */
    public createCalendar(baseCalendarDto: BaseCalendarDto, options?: AxiosRequestConfig) {
        return DefaultApiFp(this.configuration).createCalendar(baseCalendarDto, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Delete a Calendar
     * @param {number} calendarId The Calendar id
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof DefaultApi
     */
    public deleteCalendarById(calendarId: number, options?: AxiosRequestConfig) {
        return DefaultApiFp(this.configuration).deleteCalendarById(calendarId, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Returns all Calendar with their data
     * @param {string} [date] 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof DefaultApi
     */
    public getCalendar(date?: string, options?: AxiosRequestConfig) {
        return DefaultApiFp(this.configuration).getCalendar(date, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Modify a Calendar
     * @param {number} calendarId The Calendar id
     * @param {BaseCalendarDto} baseCalendarDto 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof DefaultApi
     */
    public updateCalendarById(calendarId: number, baseCalendarDto: BaseCalendarDto, options?: AxiosRequestConfig) {
        return DefaultApiFp(this.configuration).updateCalendarById(calendarId, baseCalendarDto, options).then((request) => request(this.axios, this.basePath));
    }
}
