## NativeModalContainer
Show modal content, full page or with partial transparency 

## Features
- Show modal content
- Uses boolean trigger attribute to show/hide modal
- Can be used to create transparent/translucent effects

## Use cases
- Show content where user should not be allowed to back out. Also Android back button has no effect
- Show content over current page
- Emulate hamburger menu 

## Usage
- Define a boolean attribute (referred to as _ShowModal_ from here) on the context object to show/hide the modal.
- Place the widget on the page.
- The modal is shown over the current contents; no need to place it on a separate page
- Always start your modal content with a container that has Size=Maximumspace
- To create a transparent effect, do not choose a background color for that container
- Remember that containers can have onclick events! Especially for transparent parts, when the user taps outside the modal, it should disappear. Can be achieved by setting onclick event on the transparent container and just set your _ShowModal_ attribute to false.
- Place your content in the container created earlier.
- Use spacing, justify and alignment to position the content as usual.
- Combine with the Animation widget for nice visual effects.

The test project in the GitHub repository has samples

## GitHub repository
[https://github.com/Itvisors/mendix-NativeModalContainer]

