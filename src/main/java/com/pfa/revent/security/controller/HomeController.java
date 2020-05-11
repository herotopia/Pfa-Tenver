package com.pfa.revent.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "<p><a href= /><h1>Home</h1></a></p>" +
                "<p><a href= /AboutUs><h1>AboutUs</h1></a></p>"+
                "<p><a href= /Home><h1>Login</h1></a></p>";
    }

    @GetMapping("/Home")
    public String homeLogout(){
        return "<p><a href= /Home><h1>Home</h1></a></p>" +
                "<p><a href= /BrowseEvents><h1>Browse Events</h1></a></p>"+
                "<p><a href= /CreateEvents><h1>Create Events</h1></a></p>"+
                "<p><a href= /ManageEditors><h1>Manage Users</h1></a></p>"+
                "<p><a href= /Profile><h1>Profile</h1></a></p>"+
                "<p><a href= /AboutUsLogout><h1>AboutUs</h1></a></p>"+
                "<p><a href= /logout><h1><h1>Logout</h1></h1></a></p>";
    }

    @GetMapping("/Profile")
    public String profile() {
        return "<p><a href= /Home><h1>Home</h1></a></p>" +
                "<p><a href= /BrowseEvents><h1>Browse Events</h1></a></p>"+
                "<p><a href= /CreateEvents><h1>Create Events</h1></a></p>"+
                "<p><a href= /ManageEditors><h1>Manage Users</h1></a></p>"+
                "<p><a href= /Profile><h1>Profile</h1></a></p>"+
                "<p><a href= /AboutUsLogout><h1>AboutUs</h1></a></p>"+
                "<p><a href= /logout><h1><h1>Logout</h1></h1></a></p>" +
                "<a href= /Profile/MyParticipations><h1>View My Participations</h1></a></p>"+
                "<a href= /Profile/MyEvents><h1>View My Events</h1></a></p>"+
                "<a href= /Profile/MyEditors><h1>View My Editors</h1></a>";
    }

    @GetMapping("/Profile/MyParticipations")
    public String myParticipations() {
        return  "<p><a href= /Home><h1>Home</h1></a></p>" +
                "<p><a href= /BrowseEvents><h1>Browse Events</h1></a></p>"+
                "<p><a href= /CreateEvents><h1>Create Events</h1></a></p>"+
                "<p><a href= /ManageEditors><h1>Manage Users</h1></a></p>"+
                "<p><a href= /Profile><h1>Profile</h1></a></p>"+
                "<p><a href= /AboutUsLogout><h1>AboutUs</h1></a></p>"+
                "<p><a href= /logout><h1><h1>Logout</h1></h1></a></p>" +
                "<p><h1>Profile -> MyParticipations list:</h1></p>"+
                "<p><a href= /Profile><h1>Back</h1></a></p>";
    }

    @GetMapping("/Profile/MyEvents")
    public String myEvents() {
        return  "<p><a href= /Home><h1>Home</h1></a></p>" +
                "<p><a href= /BrowseEvents><h1>Browse Events</h1></a></p>"+
                "<p><a href= /CreateEvents><h1>Create Events</h1></a></p>"+
                "<p><a href= /ManageEditors><h1>Manage Users</h1></a></p>"+
                "<p><a href= /Profile><h1>Profile</h1></a></p>"+
                "<p><a href= /AboutUsLogout><h1>AboutUs</h1></a></p>"+
                "<p><a href= /logout><h1><h1>Logout</h1></h1></a></p>" +
                "<p><h1>Profile -> MyEvents list:</h1></p>"+
                "<p><a href= /Profile><h1>Back</h1></a></p>";
    }

    @GetMapping("/Profile/MyEditors")
    public String myEditors() {
        return  "<p><a href= /Home><h1>Home</h1></a></p>" +
                "<p><a href= /BrowseEvents><h1>Browse Events</h1></a></p>"+
                "<p><a href= /CreateEvents><h1>Create Events</h1></a></p>"+
                "<p><a href= /ManageEditors><h1>Manage Users</h1></a></p>"+
                "<p><a href= /Profile><h1>Profile</h1></a></p>"+
                "<p><a href= /AboutUsLogout><h1>AboutUs</h1></a></p>"+
                "<p><a href= /logout><h1><h1>Logout</h1></h1></a></p>" +
                "<p><h1>Profile -> MyEditors list:</h1></p>"+
                "<p><a href= /Profile><h1>Back</h1></a></p>";
    }


    @GetMapping("/BrowseEvents")
    public String browseEvents() {
        return  "<p><a href= /Home><h1>Home</h1></a></p>" +
                "<p><a href= /BrowseEvents><h1>Browse Events</h1></a></p>"+
                "<p><a href= /CreateEvents><h1>Create Events</h1></a></p>"+
                "<p><a href= /ManageEditors><h1>Manage Users</h1></a></p>"+
                "<p><a href= /Profile><h1>Profile</h1></a></p>"+
                "<p><a href= /AboutUsLogout><h1>AboutUs</h1></a></p>"+
                "<p><a href= /logout><h1>Logout</h1></a></p>" +
                "<p><h1>Welcome Viewer: Here you can browse Events</h1></p>";
    }

    @GetMapping("/CreateEvents")
    public String createEvents() {
        return  "<p><a href= /Home><h1>Home</h1></a></p>" +
                "<p><a href= /BrowseEvents><h1>Browse Events</h1></a></p>"+
                "<p><a href= /CreateEvents><h1>Create Events</h1></a></p>"+
                "<p><a href= /ManageEditors><h1>Manage Users</h1></a></p>"+
                "<p><a href= /Profile><h1>Profile</h1></a></p>"+
                "<p><a href= /AboutUsLogout><h1>AboutUs</h1></a></p>"+
                "<p><a href= /logout><h1>Logout</h1></a></p>" +
                "<p><h1>Welcome Editor: Here you can create Events</h1></p>";
    }

    @GetMapping("/ManageEditors")
    public String manageEditors() {
        return  "<p><a href= /Home><h1>Home</h1></a></p>" +
                "<p><a href= /BrowseEvents><h1>Browse Events</h1></a></p>"+
                "<p><a href= /CreateEvents><h1>Create Events</h1></a></p>"+
                "<p><a href= /ManageEditors><h1>Manage Users</h1></a></p>"+
                "<p><a href= /Profile><h1>Profile</h1></a></p>"+
                "<p><a href= /AboutUsLogout><h1>AboutUs</h1></a></p>"+
                "<p><a href= /logout><h1>Logout</h1></a></p>" +
                "<p><h1>Welcome Moderator: Here you can Manage Editors</h1></p>";
    }

    @GetMapping("/AboutUs")
    public String aboutUs() {
        return  "<p><a href= /><h1>Home</h1></a></p>" +
                "<p><a href= /AboutUs><h1>AboutUs</h1></a></p>"+
                "<p><a href= /login><h1>Login</h1></a></p>" +
                "<p><h1>Welcome Any: Here you can see about info</h1></p>";
    }

    @GetMapping("/AboutUsLogout")
    public String aboutUsLogout() {
        return  "<p><a href= /Home><h1>Home</h1></a></p>" +
                "<p><a href= /BrowseEvents><h1>Browse Events</h1></a></p>"+
                "<p><a href= /CreateEvents><h1>Create Events</h1></a></p>"+
                "<p><a href= /ManageEditors><h1>Manage Users</h1></a></p>"+
                "<p><a href= /Profile><h1>Profile</h1></a></p>"+
                "<p><a href= /AboutUsLogout><h1>AboutUs</h1></a></p>"+
                "<p><a href= /logout><h1>Logout</h1></a></p>" +
                "<p><h1>Welcome Any: Here you can see about info</h1></p>";
    }

    @GetMapping("/access-denied")
    public String accessDenied() {
        return  "<p><a href= /><h1>Home</h1></a></p>" +
                "<p><h1>Access Denied</h1></p>"+
                "<p><h3>You don't have the required authentication token to access this page</h3></p>";
    }


}
